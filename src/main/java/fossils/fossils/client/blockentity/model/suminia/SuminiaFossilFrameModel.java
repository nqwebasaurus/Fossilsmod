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
	private final ModelPart Hips;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart Tail8;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart Bodyfront;
	private final ModelPart Neck;
	private final ModelPart neck2;
	private final ModelPart Head;
	private final ModelPart Lowerjawbase;
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
	private final ModelPart Righthand2;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart Lefthand;
	private final ModelPart Leftthumb;
	private final ModelPart Lefthand2;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart Righthindfoot;
	private final ModelPart Righthindfoot2;
	private final ModelPart Rightopposabletoe;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Lefthindfoot;
	private final ModelPart Lefthindfoot2;
	private final ModelPart Leftopposabletoe;
	private final ModelPart bone;
	private final ModelPart bone3;

	public SuminiaFossilFrameModel(ModelPart root) {
		this.root = root.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Tail8 = this.Tail7.getChild("Tail8");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.Bodyfront = this.body3.getChild("Bodyfront");
		this.Neck = this.Bodyfront.getChild("Neck");
		this.neck2 = this.Neck.getChild("neck2");
		this.Head = this.neck2.getChild("Head");
		this.Lowerjawbase = this.Head.getChild("Lowerjawbase");
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
		this.Righthand2 = this.Righthand.getChild("Righthand2");
		this.Leftupperarm = this.Bodyfront.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.Lefthand = this.Leftlowerarm.getChild("Lefthand");
		this.Leftthumb = this.Lefthand.getChild("Leftthumb");
		this.Lefthand2 = this.Lefthand.getChild("Lefthand2");
		this.bone2 = this.Bodyfront.getChild("bone2");
		this.bone4 = this.Bodyfront.getChild("bone4");
		this.Rightthigh = this.Hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.Righthindfoot = this.Rightshin.getChild("Righthindfoot");
		this.Righthindfoot2 = this.Righthindfoot.getChild("Righthindfoot2");
		this.Rightopposabletoe = this.Righthindfoot.getChild("Rightopposabletoe");
		this.Leftthigh = this.Hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.Lefthindfoot = this.Leftshin.getChild("Lefthindfoot");
		this.Lefthindfoot2 = this.Lefthindfoot.getChild("Lefthindfoot2");
		this.Leftopposabletoe = this.Lefthindfoot.getChild("Leftopposabletoe");
		this.bone = this.Hips.getChild("bone");
		this.bone3 = this.Hips.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -8.0F, 10.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = root.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.3F, -3.0F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(8.3F, -10.0F, -11.7F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r2 = root.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-0.9F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(8.3F, -7.8F, -11.7F, -0.5199F, 0.0653F, 1.6843F));

		PartDefinition cube_r3 = root.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(3.2F, -2.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, -10.0F, 10.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.25F, -0.4F, -0.4787F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(20, 5).addBox(-0.5F, 0.5F, 6.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(15, 0).addBox(-0.5F, 0.5F, 0.7F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -7.8941F, 5.5588F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.4942F, 12.4588F, 0.154F, 0.3396F, 0.0931F));

		PartDefinition Tail2_r1 = Tail1.addOrReplaceChild("Tail2_r1", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1624F, -0.3598F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0717F, -0.4494F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(5, 5).addBox(-0.5F, 0.0717F, 5.2506F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6624F, 5.7402F, 0.0115F, 0.5618F, 0.0945F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(30, 16).addBox(-0.5F, 0.1145F, -0.2586F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(33, 19).addBox(-0.5F, 0.1145F, 3.4414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0283F, 5.9506F, 0.2554F, 0.2958F, 0.2871F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, 0.1145F, -0.0586F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.925F, 0.0714F, 0.5661F, 0.0384F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(39, 22).addBox(-0.5F, 0.1145F, -0.3586F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(42, 25).addBox(-0.5F, 0.1145F, 3.3414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.95F, -0.0733F, 0.3474F, 0.0346F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(11, 36).addBox(-0.5F, 0.1145F, -0.0586F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.95F, -0.0436F, 0.6104F, -0.025F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(22, 36).addBox(-0.5F, 0.1145F, -0.4586F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 39).addBox(-0.5F, 0.1145F, 3.2414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.95F, 0.0051F, 0.261F, -0.0212F));

		PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create().texOffs(15, 8).addBox(-0.5F, 0.1145F, -0.2586F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.975F, 0.1134F, 0.3908F, -0.04F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, -0.1626F, -5.0347F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -7.1191F, 6.5588F, 0.1328F, -0.2163F, -0.0287F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(26, 22).addBox(-0.5F, 0.1F, -4.9F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2626F, -4.7847F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, 0.1F, -5.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(4, 33).addBox(-0.5F, 0.1F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.95F, 0.1051F, -0.0868F, -0.0091F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(13, 29).addBox(-0.5F, 0.1F, -5.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.9F, 0.1056F, -0.1302F, -0.0138F));

		PartDefinition Bodyfront = body3.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.275F, -4.875F, -0.0249F, -0.0872F, 0.0022F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(33, 13).addBox(-0.5F, -0.8F, 6.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(30, 10).addBox(-0.5F, -0.8F, 2.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.7959F, -6.8804F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4959F, -3.8054F, -0.4572F, -0.3115F, -0.0363F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(0, 52).addBox(-0.5F, 0.0F, 4.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.589F, -6.0139F, 0.0349F, 0.0F, 0.0F));

		PartDefinition neck2 = Neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1862F, -1.8525F, -0.3308F, -0.2079F, -0.0652F));

		PartDefinition Neck_r2 = neck2.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, -0.1F, 3.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4778F, -6.0864F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Head = neck2.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.0206F, -2.2797F, 0.259F, -0.306F, -0.2147F));

		PartDefinition Lowerjawbase = Head.addOrReplaceChild("Lowerjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.652F, -0.2145F, 0.7418F, 0.0F, 0.0F));

		PartDefinition Upperjawback = Head.addOrReplaceChild("Upperjawback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, -1.6321F, -4.5051F, 0.0637F, 0.0F, 0.0F));

		PartDefinition Upperjawfront = Upperjawback.addOrReplaceChild("Upperjawfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, -3.46F, 0.0848F, 0.0F, 0.0F));

		PartDefinition Upperfrontteeth = Upperjawfront.addOrReplaceChild("Upperfrontteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 0.7F, -1.9F, -0.5732F, 0.0F, 0.0F));

		PartDefinition Uppermiddleteeth = Upperjawfront.addOrReplaceChild("Uppermiddleteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.01F, 1.0F, -1.7F, -0.0848F, 0.0F, 0.0F));

		PartDefinition Upperbackteeth = Upperjawback.addOrReplaceChild("Upperbackteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, 3.9F, -3.2F, 0.1274F, 0.0F, 0.0F));

		PartDefinition Browslope = Head.addOrReplaceChild("Browslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.6321F, -4.6351F, 0.2546F, 0.0F, 0.0F));

		PartDefinition Snoutslope = Browslope.addOrReplaceChild("Snoutslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.536F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8468F, 4.8187F, -3.0304F, 0.1371F, 0.0232F, -0.1487F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0431F, 7.4113F, -0.2656F, -1.3916F, -0.0075F, -1.3249F));

		PartDefinition Righthand = Rightlowerarm.addOrReplaceChild("Righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2436F, 6.7376F, -0.328F, 1.1319F, -1.463F, 0.2609F));

		PartDefinition Rightthumb = Righthand.addOrReplaceChild("Rightthumb", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9265F, 0.1F, 0.1854F, 0.0F, 0.3302F, 0.0F));

		PartDefinition Righthand2 = Righthand.addOrReplaceChild("Righthand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 0.0F, -3.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8468F, 4.8187F, -3.0304F, 0.6608F, -0.0392F, 0.0994F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0431F, 7.4113F, -0.2656F, -1.5519F, 0.1434F, 1.2268F));

		PartDefinition Lefthand = Leftlowerarm.addOrReplaceChild("Lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2436F, 6.7376F, -0.328F, 0.5086F, 1.4384F, -0.5406F));

		PartDefinition Leftthumb = Lefthand.addOrReplaceChild("Leftthumb", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9265F, 0.1F, 0.1854F, 0.0F, -0.3302F, 0.0F));

		PartDefinition Lefthand2 = Lefthand.addOrReplaceChild("Lefthand2", CubeListBuilder.create(), PartPose.offset(0.3F, 0.0F, -3.0F));

		PartDefinition bone2 = Bodyfront.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.0F, 1.7959F, 2.1196F));

		PartDefinition bone4 = Bodyfront.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.0F, 1.7959F, 2.1196F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4698F, -5.3875F, 9.4695F, -1.3908F, -0.3008F, -0.0539F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2892F, 8.631F, 2.1816F, 2.204F, 0.0F, 0.0F));

		PartDefinition Righthindfoot = Rightshin.addOrReplaceChild("Righthindfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 6.5764F, -1.061F, -0.336F, -0.1933F, -0.0253F));

		PartDefinition Righthindfoot2 = Righthindfoot.addOrReplaceChild("Righthindfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0907F, -2.2072F, 0.0008F, 0.0F, 0.0F));

		PartDefinition Rightopposabletoe = Righthindfoot.addOrReplaceChild("Rightopposabletoe", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1119F, 0.15F, 0.4609F, 0.0F, 0.3302F, 0.0F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4698F, -5.3875F, 9.4695F, -0.7881F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2892F, 8.631F, 2.1816F, 2.8585F, 0.0F, 0.0F));

		PartDefinition Lefthindfoot = Leftshin.addOrReplaceChild("Lefthindfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 6.5764F, -1.061F, -1.378F, 0.0F, 0.0F));

		PartDefinition Lefthindfoot2 = Lefthindfoot.addOrReplaceChild("Lefthindfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0907F, -2.2072F, -0.2173F, 0.0F, 0.0F));

		PartDefinition Leftopposabletoe = Lefthindfoot.addOrReplaceChild("Leftopposabletoe", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1119F, 0.15F, 0.4609F, 0.0F, -0.3302F, 0.0F));

		PartDefinition bone = Hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9F, -8.5941F, 8.5588F, 0.0F, 0.0F, 0.1745F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9F, -8.5941F, 8.5588F, 0.0F, 0.0F, -0.1745F));

		return LayerDefinition.create(meshdefinition, 84, 84);
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