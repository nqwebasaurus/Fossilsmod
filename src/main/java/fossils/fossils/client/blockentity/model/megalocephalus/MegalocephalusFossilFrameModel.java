package fossils.fossils.client.blockentity.model.megalocephalus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MegalocephalusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart bone2;
	private final ModelPart bone10;
	private final ModelPart forelegL;
	private final ModelPart forelegL2;
	private final ModelPart bone;
	private final ModelPart forelegL3;
	private final ModelPart forelegL4;
	private final ModelPart bone6;
	private final ModelPart neck2;
	private final ModelPart head2;
	private final ModelPart upperjaw;
	private final ModelPart leftFace;
	private final ModelPart bone5;
	private final ModelPart rightFace;
	private final ModelPart bone8;
	private final ModelPart lowerjaw;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart tail6;
	private final ModelPart tail;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart tail10;
	private final ModelPart tail11;
	private final ModelPart bone3;
	private final ModelPart bone9;
	private final ModelPart hindlegL;
	private final ModelPart hindlegL2;
	private final ModelPart bone4;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL4;
	private final ModelPart bone7;

	public MegalocephalusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.chest = this.body.getChild("chest");
		this.bone2 = this.chest.getChild("bone2");
		this.bone10 = this.chest.getChild("bone10");
		this.forelegL = this.chest.getChild("forelegL");
		this.forelegL2 = this.forelegL.getChild("forelegL2");
		this.bone = this.forelegL2.getChild("bone");
		this.forelegL3 = this.chest.getChild("forelegL3");
		this.forelegL4 = this.forelegL3.getChild("forelegL4");
		this.bone6 = this.forelegL4.getChild("bone6");
		this.neck2 = this.chest.getChild("neck2");
		this.head2 = this.neck2.getChild("head2");
		this.upperjaw = this.head2.getChild("upperjaw");
		this.leftFace = this.upperjaw.getChild("leftFace");
		this.bone5 = this.leftFace.getChild("bone5");
		this.rightFace = this.upperjaw.getChild("rightFace");
		this.bone8 = this.rightFace.getChild("bone8");
		this.lowerjaw = this.head2.getChild("lowerjaw");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.tail6 = this.body3.getChild("tail6");
		this.tail = this.tail6.getChild("tail");
		this.tail7 = this.tail.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.tail10 = this.tail9.getChild("tail10");
		this.tail11 = this.tail10.getChild("tail11");
		this.bone3 = this.body3.getChild("bone3");
		this.bone9 = this.body3.getChild("bone9");
		this.hindlegL = this.body3.getChild("hindlegL");
		this.hindlegL2 = this.hindlegL.getChild("hindlegL2");
		this.bone4 = this.hindlegL2.getChild("bone4");
		this.hindlegL3 = this.body3.getChild("hindlegL3");
		this.hindlegL4 = this.hindlegL3.getChild("hindlegL4");
		this.bone7 = this.hindlegL4.getChild("bone7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 25.0F, -9.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, -0.176F, 0.1289F, 0.108F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(7, 19).addBox(-0.5F, 0.2F, 7.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 12).addBox(-0.5F, 0.2F, -0.4F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1F, -6.95F, 0.0349F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0333F, -0.3232F, -6.892F, -0.132F, -0.1298F, 0.0172F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(20, -3).addBox(-1.0F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0333F, 2.6132F, -3.1932F, 1.5708F, -0.0087F, -1.5708F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(26, 3).addBox(-0.5F, -4.0098F, -3.4208F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0333F, -0.2768F, 0.342F, 1.5621F, 0.0F, 0.0F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, 0.7902F, -5.9208F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0333F, -0.2768F, 0.042F, -0.0087F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(1.5665F, 4.1F, -3.8F));

		PartDefinition bone10 = chest.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offset(-1.5F, 4.1F, -3.8F));

		PartDefinition forelegL = chest.addOrReplaceChild("forelegL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6576F, 3.012F, -3.6937F, 0.9901F, 0.1895F, -0.3818F));

		PartDefinition forelegL2 = forelegL.addOrReplaceChild("forelegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0278F, 4.5279F, -0.0468F, -0.7524F, -0.1511F, -0.3429F));

		PartDefinition bone = forelegL2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3235F, 3.2362F, -0.249F, 0.0F, 0.0F, -0.3927F));

		PartDefinition forelegL3 = chest.addOrReplaceChild("forelegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5911F, 3.012F, -3.6937F, 1.2955F, -0.1895F, 0.3818F));

		PartDefinition forelegL4 = forelegL3.addOrReplaceChild("forelegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0278F, 4.5279F, -0.0468F, -0.7569F, -0.1198F, 0.0577F));

		PartDefinition bone6 = forelegL4.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3235F, 3.2362F, -0.249F, 0.0F, 0.0F, -0.0873F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0333F, 0.0232F, -5.958F, -0.219F, 0.1561F, 0.0995F));

		PartDefinition cube_r5 = neck2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(49, 17).addBox(-0.5F, 1.4306F, -8.1332F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3F, 6.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition head2 = neck2.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3496F, -2.766F, -0.3082F, 0.2082F, -0.0657F));

		PartDefinition upperjaw = head2.addOrReplaceChild("upperjaw", CubeListBuilder.create(), PartPose.offset(0.0F, 0.1F, 1.9F));

		PartDefinition leftFace = upperjaw.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.9F, -0.7132F, -1.6967F));

		PartDefinition bone5 = leftFace.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2924F, 0.5667F, -3.1577F, 0.0F, -0.1309F, 0.0F));

		PartDefinition rightFace = upperjaw.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.9F, -0.7132F, -1.6967F));

		PartDefinition bone8 = rightFace.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2924F, 0.5667F, -3.1577F, 0.0F, 0.1309F, 0.0F));

		PartDefinition lowerjaw = head2.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.12F, 2.5495F, 0.9687F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2958F, 0.9311F, 0.0223F, -0.0436F, -0.001F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.05F, 0.1F, -0.0175F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1499F, 10.0029F, 0.0137F, -0.1745F, -0.0024F));

		PartDefinition cube_r7 = body3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(46, 38).addBox(-0.5F, 0.2F, 3.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(43, 35).addBox(-0.5F, 0.2F, -0.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(42, 34).addBox(0.7F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.6292F, 1.6154F, -1.5708F, 0.0524F, 1.5708F));

		PartDefinition cube_r9 = body3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(45, 37).addBox(-0.5F, -1.1F, 0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.1F, -1.6232F, 0.0F, 0.0F));

		PartDefinition tail6 = body3.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2099F, 3.9076F, 0.1471F, -0.3053F, 0.0083F));

		PartDefinition cube_r10 = tail6.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(34, 39).addBox(-0.5F, 0.7F, 4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(30, 35).addBox(-0.5F, 0.7F, -0.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.2F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail = tail6.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3009F, 5.0803F, 0.206F, 0.0F, 0.0F));

		PartDefinition cube_r11 = tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(37, 32).addBox(-0.5F, 0.2F, 5.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(32, 27).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.05F, 0.0F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail7 = tail.addOrReplaceChild("tail7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0949F, 5.9428F, 0.2182F, 0.1309F, 0.0F));

		PartDefinition cube_r12 = tail7.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(22, 32).addBox(-0.5F, 0.2F, 11.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(17, 27).addBox(-0.5F, 0.2F, 6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1448F, -5.9428F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(15, 35).addBox(-0.5F, 0.25F, 0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2135F, 6.0571F, 0.1035F, 0.2181F, 0.0035F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, 0.351F, -0.1653F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F))
				.texOffs(5, 27).addBox(-0.5F, 0.351F, 6.5347F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offset(0.0F, -0.101F, 6.0653F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0749F, 6.8187F, 0.0741F, 0.2605F, -0.0259F));

		PartDefinition cube_r13 = tail10.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5F, 0.2F, 0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, 6.0F, -0.0063F, 0.3027F, -0.0411F));

		PartDefinition cube_r14 = tail11.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(19, 12).addBox(-0.5F, 0.2F, 5.8F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition bone3 = body3.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(2.0F, 1.1F, 1.7F));

		PartDefinition bone9 = body3.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(-2.0F, 1.1F, 1.7F));

		PartDefinition hindlegL = body3.addOrReplaceChild("hindlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1391F, 2.5662F, 2.0177F, 0.8656F, 0.2164F, -0.1524F));

		PartDefinition hindlegL2 = hindlegL.addOrReplaceChild("hindlegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0467F, 4.7665F, 0.5342F, 0.3044F, -0.0094F, 0.0434F));

		PartDefinition bone4 = hindlegL2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0174F, 3.1462F, -0.1996F, -0.1731F, 0.0227F, 0.1289F));

		PartDefinition hindlegL3 = body3.addOrReplaceChild("hindlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1391F, 2.5662F, 2.0177F, 0.8656F, -0.2164F, 0.1524F));

		PartDefinition hindlegL4 = hindlegL3.addOrReplaceChild("hindlegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0467F, 4.7665F, 0.5342F, 0.3044F, 0.0094F, -0.0434F));

		PartDefinition bone7 = hindlegL4.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0174F, 3.1462F, -0.1996F, -0.1731F, -0.0227F, -0.1289F));

		return LayerDefinition.create(meshdefinition, 89, 89);
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