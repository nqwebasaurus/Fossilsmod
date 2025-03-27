package fossils.fossils.client.blockentity.model.suminia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SuminiaFossilFrameModel extends SkullModelBase {
	private final ModelPart root;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart Hips;
	private final ModelPart Hips_r1;
	private final ModelPart Tail1;
	private final ModelPart Tail2_r1;
	private final ModelPart Tail2;
	private final ModelPart Tail3_r1;
	private final ModelPart Tail3;
	private final ModelPart Tail4_r1;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Bodymiddle;
	private final ModelPart Bodyfront;
	private final ModelPart Bodyfront_r1;
	private final ModelPart Neck;
	private final ModelPart Neck_r1;
	private final ModelPart Head;
	private final ModelPart Lowerjawbase;
	private final ModelPart Lowerjawmiddle;
	private final ModelPart Lowerjawfront;
	private final ModelPart Lowerfrontteeth;
	private final ModelPart Lowermiddleteeth;
	private final ModelPart Lowerbackteeth;
	private final ModelPart Jawparting;
	private final ModelPart Upperjawback;
	private final ModelPart Upperjawfront;
	private final ModelPart Upperfrontteeth;
	private final ModelPart Uppermiddleteeth;
	private final ModelPart Upperbackteeth;
	private final ModelPart Browslope;
	private final ModelPart Snoutslope;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart Righthand;
	private final ModelPart Rightthumb;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart Lefthand;
	private final ModelPart Leftthumb;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart Righthindfoot;
	private final ModelPart Rightopposabletoe;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Lefthindfoot;
	private final ModelPart Leftopposabletoe;

	public SuminiaFossilFrameModel(ModelPart root) {
		this.root = root.getChild("root");
		this.cube_r1 = this.root.getChild("cube_r1");
		this.cube_r2 = this.root.getChild("cube_r2");
		this.Hips = this.root.getChild("Hips");
		this.Hips_r1 = this.Hips.getChild("Hips_r1");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2_r1 = this.Tail1.getChild("Tail2_r1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3_r1 = this.Tail2.getChild("Tail3_r1");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4_r1 = this.Tail3.getChild("Tail4_r1");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.Bodyfront = this.Bodymiddle.getChild("Bodyfront");
		this.Bodyfront_r1 = this.Bodyfront.getChild("Bodyfront_r1");
		this.Neck = this.Bodyfront.getChild("Neck");
		this.Neck_r1 = this.Neck.getChild("Neck_r1");
		this.Head = this.Neck.getChild("Head");
		this.Lowerjawbase = this.Head.getChild("Lowerjawbase");
		this.Lowerjawmiddle = this.Lowerjawbase.getChild("Lowerjawmiddle");
		this.Lowerjawfront = this.Lowerjawmiddle.getChild("Lowerjawfront");
		this.Lowerfrontteeth = this.Lowerjawfront.getChild("Lowerfrontteeth");
		this.Lowermiddleteeth = this.Lowerjawfront.getChild("Lowermiddleteeth");
		this.Lowerbackteeth = this.Lowerjawmiddle.getChild("Lowerbackteeth");
		this.Jawparting = this.Lowerjawbase.getChild("Jawparting");
		this.Upperjawback = this.Head.getChild("Upperjawback");
		this.Upperjawfront = this.Upperjawback.getChild("Upperjawfront");
		this.Upperfrontteeth = this.Upperjawfront.getChild("Upperfrontteeth");
		this.Uppermiddleteeth = this.Upperjawfront.getChild("Uppermiddleteeth");
		this.Upperbackteeth = this.Upperjawback.getChild("Upperbackteeth");
		this.Browslope = this.Head.getChild("Browslope");
		this.Snoutslope = this.Browslope.getChild("Snoutslope");
		this.Rightupperarm = this.Bodyfront.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.Righthand = this.Rightlowerarm.getChild("Righthand");
		this.Rightthumb = this.Righthand.getChild("Rightthumb");
		this.Leftupperarm = this.Bodyfront.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.Lefthand = this.Leftlowerarm.getChild("Lefthand");
		this.Leftthumb = this.Lefthand.getChild("Leftthumb");
		this.Rightthigh = this.Hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.Righthindfoot = this.Rightshin.getChild("Righthindfoot");
		this.Rightopposabletoe = this.Righthindfoot.getChild("Rightopposabletoe");
		this.Leftthigh = this.Hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.Lefthindfoot = this.Leftshin.getChild("Lefthindfoot");
		this.Leftopposabletoe = this.Lefthindfoot.getChild("Leftopposabletoe");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, 5.5F, -9.0F, 1.0F, 19.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(1, 1).addBox(-0.5F, 14.5F, 8.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = root.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(2.0F, -5.5F, -1.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.0F, 14.0F, 9.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = root.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-4.5F, -5.5F, -1.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.31F)), PartPose.offsetAndRotation(0.0F, 14.5F, -8.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.7F, -1.0F, -0.6533F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(33, -2).addBox(-0.5F, 0.5381F, -0.3253F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -6.9941F, 5.5588F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.4941F, 13.4588F, 0.3485F, 0.3296F, 0.1171F));

		PartDefinition Tail2_r1 = Tail1.addOrReplaceChild("Tail2_r1", CubeListBuilder.create().texOffs(38, 11).addBox(-0.509F, 0.6815F, 0.0595F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.1624F, -0.3598F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1624F, 7.5402F, 0.245F, 0.4248F, 0.1027F));

		PartDefinition Tail3_r1 = Tail2.addOrReplaceChild("Tail3_r1", CubeListBuilder.create().texOffs(0, 26).addBox(-0.3F, -0.1729F, -0.5686F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1664F, 1.1132F, -0.6119F, 0.0699F, -0.0522F, -0.0046F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3774F, 8.7594F, 0.0341F, 0.6542F, 0.0208F));

		PartDefinition Tail4_r1 = Tail3.addOrReplaceChild("Tail4_r1", CubeListBuilder.create().texOffs(38, 22).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0928F, 1.167F, -0.2726F, 0.0F, -0.0524F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(28, 44).addBox(-0.6582F, 0.5465F, -0.7511F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.176F, 8.3073F, -0.2439F, 0.5107F, -0.121F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(46, 45).addBox(-0.973F, 0.4686F, -0.1489F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.0709F, 6.5893F, -0.2486F, 0.8135F, -0.1824F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, 0.9566F, -10.2612F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -7.3941F, 5.6588F, 0.0424F, 0.0F, 0.0F));

		PartDefinition Bodyfront = Bodymiddle.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1626F, -10.1347F, 0.2806F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(19, 2).addBox(-0.5F, -0.2877F, -0.3958F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.301F)), PartPose.offsetAndRotation(0.0F, 2.2961F, -9.3741F, 0.1047F, 0.0F, 0.0F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5961F, -9.2741F, -0.8786F, 0.0F, 0.0F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(36, 34).addBox(-0.5F, 0.5866F, -0.5777F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.4831F, -5.6281F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.5831F, -6.0281F, 1.0779F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase = Head.addOrReplaceChild("Lowerjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.7679F, 0.3649F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle = Lowerjawbase.addOrReplaceChild("Lowerjawmiddle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -4.9F, 0.0637F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront = Lowerjawmiddle.addOrReplaceChild("Lowerjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0848F, 0.0F, 0.0F));

		PartDefinition Lowerfrontteeth = Lowerjawfront.addOrReplaceChild("Lowerfrontteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.1F, -2.6F, 0.0637F, 0.0F, 0.0F));

		PartDefinition Lowermiddleteeth = Lowerjawfront.addOrReplaceChild("Lowermiddleteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.2F, -1.6F, -0.0848F, 0.0F, 0.0F));

		PartDefinition Lowerbackteeth = Lowerjawmiddle.addOrReplaceChild("Lowerbackteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 0.2F, -2.7F, -0.1698F, 0.0F, 0.0F));

		PartDefinition Jawparting = Lowerjawbase.addOrReplaceChild("Jawparting", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, -5.0F, -0.4882F, 0.0F, 0.0F));

		PartDefinition Upperjawback = Head.addOrReplaceChild("Upperjawback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, -2.2321F, -4.5051F, 0.0637F, 0.0F, 0.0F));

		PartDefinition Upperjawfront = Upperjawback.addOrReplaceChild("Upperjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -3.46F, 0.0848F, 0.0F, 0.0F));

		PartDefinition Upperfrontteeth = Upperjawfront.addOrReplaceChild("Upperfrontteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.7F, -1.9F, -0.5732F, 0.0F, 0.0F));

		PartDefinition Uppermiddleteeth = Upperjawfront.addOrReplaceChild("Uppermiddleteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 1.0F, -1.7F, -0.0848F, 0.0F, 0.0F));

		PartDefinition Upperbackteeth = Upperjawback.addOrReplaceChild("Upperbackteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 3.9F, -3.2F, 0.1274F, 0.0F, 0.0F));

		PartDefinition Browslope = Head.addOrReplaceChild("Browslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.2321F, -4.6351F, 0.2546F, 0.0F, 0.0F));

		PartDefinition Snoutslope = Browslope.addOrReplaceChild("Snoutslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.536F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, 6.1961F, -6.4741F, 0.9226F, 0.0392F, -0.0994F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3346F, 5.4902F, 0.3519F, -0.7098F, 0.1651F, 0.4196F));

		PartDefinition Righthand = Rightlowerarm.addOrReplaceChild("Righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2306F, 7.861F, -0.8747F, 0.1783F, -0.3264F, -0.3394F));

		PartDefinition Rightthumb = Righthand.addOrReplaceChild("Rightthumb", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2F, 0.7F, -1.5F, 0.0F, 0.6793F, 0.0F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, 6.1961F, -6.4741F, 0.9226F, -0.0392F, 0.0994F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3346F, 5.4902F, 0.3519F, -0.7098F, -0.1651F, -0.4196F));

		PartDefinition Lefthand = Leftlowerarm.addOrReplaceChild("Lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2306F, 7.861F, -0.8747F, 0.1783F, 0.3264F, 0.3394F));

		PartDefinition Leftthumb = Lefthand.addOrReplaceChild("Leftthumb", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2F, 0.7F, -1.5F, 0.0F, -0.6793F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, -3.9941F, 9.5588F, -1.25F, -0.5519F, -0.1061F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4108F, 9.5178F, -1.2552F, 1.6368F, 0.0F, 0.1061F));

		PartDefinition Righthindfoot = Rightshin.addOrReplaceChild("Righthindfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.0F, 2.5F, 0.219F, 0.0308F, -0.1931F));

		PartDefinition Rightopposabletoe = Righthindfoot.addOrReplaceChild("Rightopposabletoe", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2F, 0.7F, -1.5F, 0.0F, 0.6793F, 0.0F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, -3.9941F, 9.5588F, -1.25F, 0.5519F, 0.1061F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4108F, 9.5178F, -1.2552F, 1.6368F, 0.0F, -0.1061F));

		PartDefinition Lefthindfoot = Leftshin.addOrReplaceChild("Lefthindfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.0F, 2.5F, 0.219F, -0.0308F, 0.1931F));

		PartDefinition Leftopposabletoe = Lefthindfoot.addOrReplaceChild("Leftopposabletoe", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2F, 0.7F, -1.5F, 0.0F, -0.6793F, 0.0F));

		return LayerDefinition.create(meshdefinition, 75, 75);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.root.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}