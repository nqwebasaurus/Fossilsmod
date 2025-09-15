package fossils.fossils.client.blockentity.model.tiarajudens;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TiarajudensFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
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
	private final ModelPart Tail9;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart Bodyfront;
	private final ModelPart Neck;
	private final ModelPart neck2;
	private final ModelPart Head;
	private final ModelPart Lowerjawbase;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart upperarm1;
	private final ModelPart lowerarm1;
	private final ModelPart hand1;
	private final ModelPart upperarm2;
	private final ModelPart lowerarm2;
	private final ModelPart hand2;
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

	public TiarajudensFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Tail8 = this.Tail7.getChild("Tail8");
		this.Tail9 = this.Tail8.getChild("Tail9");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.Bodyfront = this.body3.getChild("Bodyfront");
		this.Neck = this.Bodyfront.getChild("Neck");
		this.neck2 = this.Neck.getChild("neck2");
		this.Head = this.neck2.getChild("Head");
		this.Lowerjawbase = this.Head.getChild("Lowerjawbase");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.upperarm1 = this.Bodyfront.getChild("upperarm1");
		this.lowerarm1 = this.upperarm1.getChild("lowerarm1");
		this.hand1 = this.lowerarm1.getChild("hand1");
		this.upperarm2 = this.Bodyfront.getChild("upperarm2");
		this.lowerarm2 = this.upperarm2.getChild("lowerarm2");
		this.hand2 = this.lowerarm2.getChild("hand2");
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

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -16.7F, 9.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -4.45F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(5.1F, -12.55F, -12.1F, 0.0F, -0.6545F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-1.95F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(5.1F, -12.55F, -12.1F, 0.6545F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-0.1F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -14.4F, 10.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.2862F, -0.4899F, -0.3042F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, 0.5F, 1.1F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -7.8941F, 5.5588F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.4387F, 13.4651F, 0.1504F, 0.2653F, -0.0029F));

		PartDefinition Tail3_r1 = Tail1.addOrReplaceChild("Tail3_r1", CubeListBuilder.create().texOffs(25, 40).addBox(-0.5F, -0.5F, 3.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(22, 37).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1624F, -0.3598F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(11, 37).addBox(-0.5F, 0.0717F, 0.0506F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3317F, 3.8586F, -0.1438F, 0.2592F, -0.0371F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(36, 16).addBox(-0.5F, 0.1145F, -0.3586F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(39, 19).addBox(-0.5F, 0.1145F, 3.3414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0525F, 3.9191F, 0.0878F, 0.1739F, 0.0152F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(42, 59).addBox(-0.5F, 0.1145F, -0.0586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.925F, 0.1488F, 0.1295F, 0.0194F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(59, 47).addBox(-0.5F, 0.1145F, -0.4586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(60, 48).addBox(-0.5F, 0.1145F, 1.2414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.009F, 1.94F, 0.1144F, 0.1734F, 0.0198F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(60, 0).addBox(-0.5F, 0.1145F, -0.0586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0035F, 1.9486F, -0.0363F, 0.1744F, -0.0063F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(60, 34).addBox(-0.5F, 0.1145F, -0.2586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0151F, 1.8948F, -0.1259F, 0.2165F, -0.0272F));

		PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create().texOffs(57, 60).addBox(-0.5F, 0.1145F, -0.4586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(58, 61).addBox(-0.5F, 0.1145F, 1.2414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0034F, 1.9159F, -0.1884F, 0.2144F, -0.0406F));

		PartDefinition Tail9 = Tail8.addOrReplaceChild("Tail9", CubeListBuilder.create().texOffs(45, 11).addBox(-0.5F, 0.1145F, -0.0586F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0055F, 1.8828F, -0.1989F, -0.3857F, 0.0757F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(19, 23).addBox(-0.5F, -0.1626F, -4.6347F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -7.1191F, 6.5588F, 0.1132F, -0.1301F, -0.0147F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, 0.1F, -5.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(3, 28).addBox(-0.5F, 0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2626F, -4.7847F, 0.1571F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(13, 30).addBox(-0.5F, 0.1F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.95F, 0.088F, -0.1304F, -0.0115F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(26, 30).addBox(-0.5F, 0.1F, -4.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.9F, 0.088F, -0.1304F, -0.0115F));

		PartDefinition Bodyfront = body3.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.275F, -4.875F, -0.025F, -0.1309F, 0.0033F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(33, 37).addBox(-0.5F, -0.8F, 2.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(35, 39).addBox(-0.5F, -0.8F, 6.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.7959F, -6.8804F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4959F, -3.8054F, -0.4833F, -0.2342F, -0.0153F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(50, 62).addBox(-0.5F, -0.1F, 5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(49, 61).addBox(-0.5F, -0.1F, 3.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.589F, -6.0139F, 0.0349F, 0.0F, 0.0F));

		PartDefinition neck2 = Neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1862F, -1.8525F, -0.3433F, -0.3808F, 0.2196F));

		PartDefinition Neck_r2 = neck2.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(43, 22).addBox(-0.5F, -0.1F, 3.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4778F, -6.0864F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Head = neck2.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.01F, -0.1405F, -2.7651F, 0.3617F, 0.0477F, -0.1203F));

		PartDefinition Lowerjawbase = Head.addOrReplaceChild("Lowerjawbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.1267F, -0.543F, 1.6144F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(-0.1F, 1.0863F, -5.8424F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.12F, 1.0863F, -5.8424F));

		PartDefinition upperarm1 = Bodyfront.addOrReplaceChild("upperarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2551F, 6.0047F, -1.8577F, 1.0576F, 0.2197F, -0.4443F));

		PartDefinition lowerarm1 = upperarm1.addOrReplaceChild("lowerarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0873F, 5.6638F, -0.5001F, -1.0783F, 0.1764F, 1.6365F));

		PartDefinition hand1 = lowerarm1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0448F, 5.3251F, -1.0759F, 0.8905F, 1.2161F, -0.6661F));

		PartDefinition upperarm2 = Bodyfront.addOrReplaceChild("upperarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2551F, 6.0047F, -1.8577F, 0.1493F, 0.175F, 0.5569F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0873F, 5.6638F, -0.5001F, -0.5259F, 0.5218F, -1.0779F));

		PartDefinition hand2 = lowerarm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0448F, 5.3251F, -1.0759F, 0.7706F, -1.1226F, 0.072F));

		PartDefinition bone2 = Bodyfront.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(3.0F, 1.7959F, 2.1196F));

		PartDefinition bone4 = Bodyfront.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.0F, 1.7959F, 2.1196F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4698F, -5.5598F, 9.0001F, -0.3843F, -0.0893F, -0.2464F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2892F, 7.577F, 2.0435F, 0.7539F, -0.191F, 0.1061F));

		PartDefinition Righthindfoot = Rightshin.addOrReplaceChild("Righthindfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 7.0847F, -0.8126F, 0.2365F, 0.0F, 0.0F));

		PartDefinition Righthindfoot2 = Righthindfoot.addOrReplaceChild("Righthindfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0907F, -2.2072F, -0.2173F, 0.0F, 0.0F));

		PartDefinition Rightopposabletoe = Righthindfoot.addOrReplaceChild("Rightopposabletoe", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1119F, 0.15F, 0.4609F, 0.0F, 0.3302F, 0.0F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4698F, -5.5598F, 9.0001F, 0.0084F, 0.0893F, 0.2464F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2892F, 7.577F, 2.0435F, 1.0157F, 0.191F, -0.1061F));

		PartDefinition Lefthindfoot = Leftshin.addOrReplaceChild("Lefthindfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 7.0847F, -0.8126F, -0.1999F, 0.0F, 0.0F));

		PartDefinition Lefthindfoot2 = Lefthindfoot.addOrReplaceChild("Lefthindfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0907F, -2.2072F, -0.4791F, 0.0F, 0.0F));

		PartDefinition Leftopposabletoe = Lefthindfoot.addOrReplaceChild("Leftopposabletoe", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1119F, 0.15F, 0.4609F, 0.0F, -0.3302F, 0.0F));

		PartDefinition bone = Hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9695F, -8.9881F, 7.9588F, 0.0F, 0.0F, 0.1745F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9695F, -8.9881F, 7.9588F, 0.0F, 0.0F, -0.1745F));

		return LayerDefinition.create(meshdefinition, 88, 88);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}